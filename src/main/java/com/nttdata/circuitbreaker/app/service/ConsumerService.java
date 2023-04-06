package com.nttdata.circuitbreaker.app.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ConsumerService {
    /**
     * Injected RestTemplate.
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * CallApp nttdata-btc-account.
     */
    @HystrixCommand(fallbackMethod = "callAccountApp_Fallback")
    public String callAccountApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8085/api/v1/account/", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-account!");
        return "CARGA NORMAL !! " + "nttdata-btc-account Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-account.
     *
     * @return {@link String}
     */
    private String callAccountApp_Fallback() {
        log.info("nttdata-btc-account Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-account en este momento!!";
    }

    /**
     * CallApp nttdata-btc-card.
     */
    @HystrixCommand(fallbackMethod = "callCardApp_Fallback")
    public String callCardApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8087/api/v1/card/", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-card!");
        return "CARGA NORMAL !! " + "nttdata-btc-card Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-card.
     *
     * @return {@link String}
     */
    private String callCardApp_Fallback() {
        log.info("nttdata-btc-card Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-card en este momento!!";
    }

    /**
     * CallApp nttdata-btc-customer.
     */
    @HystrixCommand(fallbackMethod = "callCustomerApp_Fallback")
    public String callCustomerApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8083/api/v1/customer/", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-customer!");
        return "CARGA NORMAL !! " + "nttdata-btc-customer Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-customer.
     *
     * @return {@link String}
     */
    private String callCustomerApp_Fallback() {
        log.info("nttdata-btc-customer Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-customer en este momento!!";
    }

    /**
     * CallApp nttdata-btc-notification.
     */
    @HystrixCommand(fallbackMethod = "callNotificationApp_Fallback")
    public String callNotificationApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8083/api/v1/customer/", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-notification!");
        return "CARGA NORMAL !! " + "nttdata-btc-notification Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-notification.
     *
     * @return {@link String}
     */
    private String callNotificationApp_Fallback() {
        log.info("nttdata-btc-notification Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-notification en este momento!!";
    }

    /**
     * CallApp nttdata-btc-operation.
     */
    @HystrixCommand(fallbackMethod = "callOperationApp_Fallback")
    public String callOperationApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8088/api/v1/notifications", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-operation!");
        return "CARGA NORMAL !! " + "nttdata-btc-operation Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-operation.
     *
     * @return {@link String}
     */
    private String callOperationApp_Fallback() {
        log.info("nttdata-btc-operation Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-operation en este momento!!";
    }

    /**
     * CallApp nttdata-btc-product.
     */
    @HystrixCommand(fallbackMethod = "callProductApp_Fallback")
    public String callProductApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8084/api/v1/product/", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-product!");
        return "CARGA NORMAL !! " + "nttdata-btc-product Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-product.
     *
     * @return {@link String}
     */
    private String callProductApp_Fallback() {
        log.info("nttdata-btc-product Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-product en este momento!!";
    }

    /**
     * CallApp nttdata-btc-wallet.
     */
    @HystrixCommand(fallbackMethod = "callWalletApp_Fallback")
    public String callWalletApp() {
        log.info("Cargando informacion");

        String response = restTemplate
                .exchange("http://localhost:8089/api/v1/wallet/", HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }
                        , "")
                .getBody();
        log.info("Respuesta recibida de nttdata-btc-wallet!");
        return "CARGA NORMAL !! " + "nttdata-btc-wallet Detalle : " + response;
    }

    /**
     * CallAppFallBack nttdata-btc-wallet.
     *
     * @return {@link String}
     */
    private String callWalletApp_Fallback() {
        log.info("nttdata-btc-wallet Fuera de Servicio !!  :C   FallBack Enabled!!");
        return "CIRCUIT BREAKER ENABLED!! No hay respuesta de nttdata-btc-wallet en este momento!!";
    }
}