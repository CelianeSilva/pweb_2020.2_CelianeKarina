package br.com.celiane.cadpessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadPessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadPessoasApplication.class, args);
		
		
		
		# ===============================
				# = Logs
				# ===============================
				logging.level.root=INFO
				logging.level.org.springframework.web=INFO
				logging.level.org.hibernate=ERROR
				logging.file.name=log/cad_pessoas_celiane.log

				# ===============================
				# = Banner
				# ===============================
				spring.output.ansi.enabled=always
				application.title=Cadastro de Pessoas by Celiane
				application.version=0.0.1

				# ===============================
				# = Messages
				# ===============================
				spring.messages.basename=messages
				spring.messages.cache-duration=-1
				spring.messages.encoding=UTF-8

				# ===============================
				# = Thymeleaf
				# ===============================
				spring.thymeleaf.mode=HTML
				spring.thymeleaf.cache=false
				spring.thymeleaf.encoding=UTF-8

				# ===============================
				# = JPA / HIBERNATE
				# ===============================
				spring.jpa.hibernate.ddl-auto=create-drop
				spring.jpa.open-in-view=true
				spring.jpa.show-sql=true
				# The SQL dialect makes Hibernate generate better SQL for the chosen database
				spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.H2Dialect

				# ===============================
				# = H2 DATA SOURCE
				# ===============================
				spring.datasource.url=jdbc:h2:mem:cadpessoas
				spring.datasource.username=admin
				spring.datasource.password=admin
				spring.h2.console.enabled=true
				spring.h2.console.path=/h2-console

				# ==============================================================
				# = Spring Security / Queries em AuthenticationManagerBuilder  
				# ==============================================================
				#spring.queries.users-query=select email, password, active from users where email=?
				#spring.queries.group-query=select u.email, g.name from users u inner join groups g on u.group_id = g.id where u.email=?

				# ==============================================================
				# = i18n - Internationalization  
				# ==============================================================
				#spring.messages.basename=messages/messages
				#spring.messages.cache-seconds=-1
				#spring.messages.encoding=ISO-8859-1

				# ===============================
				# = MySQL DATA SOURCE
				# ===============================
				#spring.datasource.url= jdbc:mysql://localhost:3306/cadpessoas
				#spring.datasource.username=root
				#spring.datasource.password=

				# Keep the connection alive if idle for a long time (needed in production)
				#spring.datasource.testWhileIdle=true
				#spring.datasource.validationQuery=SELECT 1

				# The SQL dialect makes Hibernate generate better SQL for the chosen database
				#spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5Dialect


	}

}
