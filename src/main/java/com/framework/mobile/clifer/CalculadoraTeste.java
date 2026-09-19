package com.framework.mobile.clifer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class CalculadoraTeste {
    public static void main(String[] args) {

        try {
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setDeviceName("Nome_Do_Seu_Dispositivo")
                    .setAppPackage("com.google.android.calculator")
                    // .setAppActivity("com.google.android.calculator")
                    .setNoReset(true)
                    .setFullReset(false)
                    .setNewCommandTimeout(Duration.ofSeconds(60));

            URL url = URI.create("http://127.0.0.1:4723/").toURL();

            AndroidDriver driver = new AndroidDriver(url, options);

            System.out.println("Driver iniciado com sucesso!");

            driver.quit();

        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }

}

