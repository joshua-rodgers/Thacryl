package Thacryl;

public class Memory{
    private int[] ram;


    public Memory(){
        ram = new int[100];
    }

    public int[] fetch(int location, int offset){
        int[] mem_return;

        if(location >= 0 && location < ram.length - 1){
            if(offset > 0 && location + offset < ram.length - 1){
                mem_return = new int[offset + 1];
                for(;offset >= 0; offset--){
                    mem_return[offset] = ram[location + offset];
                }
                return mem_return;
            }  
        }
        // ONLY GET HERE IF THERE'S TROUBLE
        mem_return = new int[1];
        mem_return[0] = -10;
        return mem_return;
    }

    public int write(int location, int[] data){
        int mem_return = 0;
        int offset = data.length;

        if(location >= 0 && location < ram.length - 1){
            if(data.length > 0 && location + data.length < ram.length - 1){
                for(;offset >= 0; offset--){
                    ram[location + offset] = data[offset];
                }
                return mem_return;
            }  
        }
        // ONLY GET HERE IF THERE'S TROUBLE
        mem_return = -10;
        return mem_return;
    }
}