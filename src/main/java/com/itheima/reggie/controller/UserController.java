package com.itheima.reggie.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.commons.lang.StringUtils;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.User;
import com.itheima.reggie.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
//    private RedisTemplate redisTemplate;

    /**
     * 发送手机短信验证码
     * @param user
     * @param session
     * @return
     */
    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user, HttpSession session){
        //获取手机号
        String phone=user.getPhone();

        if(StringUtils.isNotEmpty(phone)){
            // ランダムに4桁の確認コード
//            String code = ValidateCodeUtils.generateValidateCode(4).toString();
//            log.info("code={}",code);

//            //需要将生成的验证码保存到Session
//            session.setAttribute(phone,code);

            //将生成的验证码缓存到redis中，有效期为5分钟
//            redisTemplate.opsForValue().set(phone,code,5, TimeUnit.MINUTES);

            return R.success("手机验证码短信发送成功");

        }

        return R.error("短信发送失败");
    }

    /**
     * 移动端用户登录
     * @param map
     * @param session
     */
    @PostMapping("/login")
    public R<User> login(@RequestBody Map map,HttpSession session){

        log.info(map.toString());

        //获取手机号
        String phone = map.get("phone").toString();

        //获取验证码
        String code = map.get("code").toString();

        //从Session中获取保存的验证码
//        Object codeInSession = session.getAttribute(phone);
        //从redis中获取缓存的验证码
//        Object codeInSession = redisTemplate.opsForValue().get(phone);

        //进行验证码的比对(页面提交的验证码和Session中保存的验证码比对)
//        if(codeInSession!=null&&codeInSession.equals(code)) {
//            //判断当前手机号对应的用户是否为新用户，如果是新用户就自动完成注册
//            LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
//            queryWrapper.eq(User::getPhone,phone);
//            User user = userService.getOne(queryWrapper);
//            if(user==null){
//                //判断当前手机号对应的用户是否为新用户，如果是新用户就自动完成注册
//                user=new User();
//                user.setPhone(phone);
//                user.setStatus(1);
//                userService.save(user);
//            }
//            session.setAttribute("user",user.getId());
//            //如果用户登录成功则删除Redis中缓存的验证码
////            redisTemplate.delete(phone);
//            return R.success(user);
//        }

        return R.error("登录失败");
    }

    /**
     * C端用户退出功能
     * ①在controller中创建对应的处理方法来接受前端的请求，请求方式为post；
     * ②清理session中的用户id
     * ③返回结果（前端页面会进行跳转到登录页面）
     * @param request
     * @return
     */
    @PostMapping("/loginout")
    public R<String> logout(HttpServletRequest request){
        request.removeAttribute("user");
        return R.success("退出成功");
    }
}
