package com.educacionit.cursospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.educacionit.cursospring.interfaces.UsuarioServicio;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	String[] resources = new String[] { "/include/**", "/css/**", "/icons/**", "/img/**", "/js/**", "/layer/**" };
	@Autowired
	UsuarioServicio usuarioServicio;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		// super.configure(auth);

		auth.userDetailsService(usuarioServicio).passwordEncoder(passwordEncoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		// super.configure(http);
		// http.authorizeRequests().anyRequest().authenticated().and().authorizeHttpRequests();
		// http.cors().and().csrf().disable().authorizeRequests().anyRequest().authenticated().and().authorizeHttpRequests();
		/*
		 * http .authorizeRequests() .antMatchers(resources).permitAll()
		 * .antMatchers("/","/index","/signup").permitAll()
		 * .anyRequest().authenticated() .and() /*.formLogin() .loginPage("/login")
		 * .permitAll() .defaultSuccessUrl("/userForm") .failureUrl("/login?error=true")
		 * .usernameParameter("username") .passwordParameter("password") .and()
		 */
		/*
		 * .csrf().disable() .logout() .permitAll() .logoutSuccessUrl("/login?logout");
		 */

		http.cors().and().csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET, "/api/**").permitAll()
				.anyRequest().authenticated().and().httpBasic();
		;
		// .authorizeRequests().anyRequest().authenticated();
		// http.authorizeRequests().anyRequest().authenticated().and().authorizeHttpRequests();
	}
	/*
	 * @Bean CorsConfigurationSource corsConfigurationSource() { CorsConfiguration
	 * configuration = new CorsConfiguration();
	 * configuration.setAllowedOrigins(Arrays.asList("http://localhost:8081"));
	 * configuration.setAllowedMethods(Arrays.asList("GET","POST"));
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
	 * configuration); return source; }
	 */

}
