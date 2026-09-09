package br.com.cod3r.iterator.tvChannel.after;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.searchAvaiableChannels();
        for(Integer channel : tv) {
            System.out.printf("Zapping at channel #%d%n", channel);
        }
    }
}
