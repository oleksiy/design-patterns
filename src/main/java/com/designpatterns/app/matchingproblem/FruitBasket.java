package com.designpatterns.app.matchingproblem;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class FruitBasket {
    private final List<String> codes;
    private final List<String> cart;

    public FruitBasket(List<String> codes, List<String> cart) {
        this.codes = codes;
        this.cart = cart;
    }

    public int isWinner(List<String> codes, List<String> cart) {
        log.info("The keys are {}, \nand the cart is {}", codes, cart);
        int[] isMatch = new int[codes.size()];
        int startWindow = 0;
        for(int group = 0; group < codes.size(); group++){
            String[] matchGroup = getMatchingWindow(codes.get(group));
            int endWindow = matchGroup.length - 1 + startWindow;
            boolean matchFound = false;
            log.info("start is {}, and end is {}", startWindow, endWindow);
            for(int i = startWindow; i < cart.size() && endWindow < cart.size(); startWindow++, endWindow ++) {
                log.info("comparing index {} and {}", startWindow, endWindow);
                if(startWindow == endWindow && matchGroup[0].equalsIgnoreCase(cart.get(startWindow))) {
                    log.info("Found a match at index {}", startWindow);
                    matchFound = true;
                    startWindow++;
                    break;
                } else {
                    for(int j = startWindow, match = 0; j < endWindow; j++, match++) {
                        if(cart.get(j).equalsIgnoreCase(matchGroup[match]) || matchGroup[match].equalsIgnoreCase("anything")) {
                            matchFound = true;
                        } else {
                            matchFound = false;
                            break;
                        }
                    }
                    if(matchFound) {
                        log.info("Sliding window comparison matched ending at index {}", endWindow);
                        break;
                    }
                }
            }
            if(matchFound) {
                isMatch[group] = 1;
            }
        }

        return 0;
    }

    private String[] getMatchingWindow(String matchGroup) {
        return matchGroup.split(" ");
    }
}
