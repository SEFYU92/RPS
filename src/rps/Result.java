/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rps;

/**
 *
 * @author Youssef
 */
public enum Result
{
        WIN("Win"),
        TIE("Tie"),
        LOST("Lost");
        
        public final String content;
        Result(final String s)
        {
                content = s;
        }
}
