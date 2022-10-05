/*
 * (C) Copyright Hemajoo Systems Inc.  2022 - All Rights Reserved
 * -----------------------------------------------------------------------------------------------
 * All information contained herein is, and remains the property of
 * Hemajoo Inc. and its suppliers, if any. The intellectual and technical
 * concepts contained herein are proprietary to Hemajoo Inc. and its
 * suppliers and may be covered by U.S. and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 *
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained from
 * Hemajoo Systems Inc.
 * -----------------------------------------------------------------------------------------------
 */
package com.hemajoo.education.spring.amqp.base.agent;

public enum QueueType
{
    /**
     * Agent's <b>default</b> queue type.
     */
    DEFAULT,

    /**
     * Agent's queue type dedicated to <b>chat</b>.
     */
    CHAT,

    /**
     * Agent's queue type dedicated to <b>events</b>.
     */
    EVENT,

    /**
     * Agent's queue type dedicated to <b>action house</b>.
     */
    AUCTION_HOUSE,
}