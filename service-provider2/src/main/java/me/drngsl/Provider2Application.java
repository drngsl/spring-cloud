/**
 * 
 */
package me.drngsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dengshaolin
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider2Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Provider2Application.class, args);
	}
}
