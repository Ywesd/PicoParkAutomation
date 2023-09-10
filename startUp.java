package pico;

import net.dv8tion.jda.api.JDABuilder;

public class startUp {
	public static void main(String[] args) {
		JDABuilder picoParkPlayer = JDABuilder.createDefault("MTE1MDUyNTY2NDcyMjY5NDIwNg.G6pJhe.Mrkse4I1PTPCv95zSCJ-iEYmyFtKxcm-zbCyhA");
		picoParkPlayer.addEventListeners(new Controls());
		picoParkPlayer.build();
	}
}
