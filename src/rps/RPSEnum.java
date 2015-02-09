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
public enum RPSEnum
{
        ROCK("Rock"),
        PAPER("Paper"),
        SCISORS ("Scisors");
        public final String content;
        RPSEnum(final String s)
        {
                content = s;
        }
}
