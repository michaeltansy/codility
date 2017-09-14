{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 // you can also use imports, for example:\
import java.util.*;\
\
// you can write to stdout for debugging purposes, e.g.\
// System.out.println("this is a debug message");\
\
class Solution \{\
    public int[] solution(int[] A, int K) \{\
        int B[] = new int[A.length];\
        int length = A.length;\
        for(int i=0; i < length; i++)\{\
            B[(i+K) % length] = A[i]; \
        \}\
        \
        return B;\
    \}\
\}}