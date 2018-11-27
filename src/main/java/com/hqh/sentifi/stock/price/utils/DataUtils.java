/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hqh.sentifi.stock.price.utils;

import java.util.Date;

/**
 *
 * @author ASUS-USER
 */
public class DataUtils {
    public static boolean ValidateStartAndEndDate(Date startDate, Date endDate) {
        if (startDate == null || startDate.after(endDate))
        return false;
        
    }
}
