package Thacryl;

import Thacryl.Memory;

public class Processor {
    Clock clock;
    int[][] oc_mem;  // ON_CHIP_MEMORY (REGISTERS)

    public Processor(){
        this.clock = new Clock(this);
        init_regs();
        clock.start_clock();
    }

    private void init_regs(){
        oc_mem = new int[4][2]; // OUTER: IP, SP, PC, GP INNER: UPPER, LOWER ???
    }

    public void cycle(){
        
    }
}

class Clock {
    long start_cycle;
    long diff;
    long elapsed;
    Processor CPU;

    public Clock(Processor cpu){
        this.CPU = cpu;
    }

    public void start_clock(){
        start_cycle = System.currentTimeMillis();
        while(elapsed < 100){
            diff = System.currentTimeMillis() - start_cycle;
            elapsed += diff;
        }
        CPU.cycle();
    }
}