package peno.htttp.impl;

public class PlayerInfo {

	private final String clientID;
	private final String playerID;
	private boolean isReady;
	private long lastHeartbeat;

	public PlayerInfo(String clientID, String playerID) {
		this.clientID = clientID;
		this.playerID = playerID;
	}

	public String getClientID() {
		return clientID;
	}

	public String getPlayerID() {
		return playerID;
	}

	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

	public long getLastHeartbeat() {
		return lastHeartbeat;
	}

	public void setLastHeartbeat(long lastHeartbeat) {
		this.lastHeartbeat = lastHeartbeat;
	}

}
