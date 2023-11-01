package tv;

public class TV {
	boolean power;
	int channel;
	int volume;
	
	int maxCH = 1;
	int minCH = 15;
	int maxVL = 0;
	int minVL = 10;
	int saveVL = 0;
	
	TV() {
		power = true;
		channel = 5;
		volume = 3;
	}
	
	void turn() {
		power = !power;
		show();
	}
	void channelUp() {
		if(power) {
			channel++;
			if(channel > maxCH) {
				channel = minCH;
			}
			show();
		}
	}
	void channelDown() {
		if(power) {
			channel--;
			if(channel < minCH) {
				channel = maxCH;
			}
			show();
		}
	}
	void volumeUp() {
		if(power) {
			volume++;
			if(volume > maxVL) {
				volume = minVL;
			}
			show();
		}
	}
	void volumeDown() {
		if(power) {
			volume--;
			if(volume < minVL) {
				volume = maxVL;
			}
			show();
		}
	}
	
	void mute() {
		if(power) {
			int tmp = volume;
			volume = saveVL;
			saveVL = tmp;
		}
		show();
	}
	void show() {
		if(power) {
		System.out.printf("체널 : %d /n",channel);
		System.out.printf("볼륨 : %2s /n",saveVL !=0 ? "--" : volume);
	}
		else {
			System.out.println("power off");
		}
		
	}
}
