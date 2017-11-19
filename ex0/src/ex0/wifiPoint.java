/**
 * @author yaron samuel
 */

package ex0;

public class wifiPoint {
	String SSID;
	String MAC;
	int Signal;
	int Channel;
	public wifiPoint() {
	}
	public wifiPoint(String sSID, String mAC, int signal, int channel) {
		super();
		SSID = sSID;
		MAC = mAC;
		Signal = signal;
		Channel = channel;
	}
	@Override
	public String toString() {
		return "wifiPoint [SSID=" + SSID + ", MAC=" + MAC + ", Signal=" + Signal + ", Channel=" + Channel + "]";
	}
	/**
	 * @return the sSID
	 */
	public String getSSID() {
		return SSID;
	}
	/**
	 * @return the mAC
	 */
	public String getMAC() {
		return MAC;
	}
	/**
	 * @return the signal
	 */
	public int getSignal() {
		return Signal;
	}
	/**
	 * @return the channel
	 */
	public int getChannel() {
		return Channel;
	}
	
	
}