package com.xpinjection.patterns.proxy;

import com.xpinjection.patterns.proxy.canonical.Order;

/**
 * @author Alimenkou Mikalai
 */
public class PermissionChecker {
    private final ThreadLocal<Long> currentUser = new ThreadLocal<>();

    public void setCurrentUser(long userId) {
        currentUser.set(userId);
    }

    public void checkPermission(Order order) {
        if (order.getUserId() != currentUser.get()) {
            throw new IllegalStateException("Order for another user can't be processed: " + order);
        }
    }
}
