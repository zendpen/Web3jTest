package com.example.web3jtest;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Web3j web3j = Web3j.build(new HttpService(
                "https://rinkeby.infura.io/<your token>"));  // FIXME: Enter your Infura token here;
        try {
            log.info("Connected to Ethereum client version: "
                    + web3j.web3ClientVersion().send().getWeb3ClientVersion());
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
