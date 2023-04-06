package com.nttdata.circuitbreaker.app.controller;

import com.nttdata.circuitbreaker.app.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ConsumerDataController {
    /**
     * Injectes ConsumerService.
     */
    @Autowired
    ConsumerService service;

    /**
     * Service getAccounts.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getAccount")
    public String getAccounts() {
        log.info("Haciendo llamado a nttdata-btc-account!!");
        return service.callAccountApp();
    }

    /**
     * Service getCards.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getCard")
    public String callCards() {
        log.info("Haciendo llamado a nttdata-btc-card!!");
        return service.callCardApp();
    }

    /**
     * Service callCustomers.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getCustomer")
    public String callCustomers() {
        log.info("Haciendo llamado a nttdata-btc-customer!!");
        return service.callCustomerApp();
    }

    /**
     * Service callNotifications.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getNotification")
    public String callNotifications() {
        log.info("Haciendo llamado a nttdata-btc-notification!!");
        return service.callNotificationApp();
    }

    /**
     * Service callOperations.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getOperation")
    public String callOperations() {
        log.info("Haciendo llamado a nttdata-btc-operation!!");
        return service.callOperationApp();
    }

    /**
     * Service callProductApp.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getProduct")
    public String callProductApp() {
        log.info("Haciendo llamado a nttdata-btc-product!!");
        return service.callOperationApp();
    }

    /**
     * Service callWalletApp.
     *
     * @return {@link String}
     */
    @GetMapping(value = "/getWallet")
    public String callWalletApp() {
        log.info("Haciendo llamado a nttdata-btc-wallet!!");
        return service.callWalletApp();
    }
}