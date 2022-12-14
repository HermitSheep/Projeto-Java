package prr.core;

import prr.core.exception.*;

public class BASIC extends Terminal {
  public BASIC(String id, Client client) {
    super(id, client);
    _type = "BASIC";
  }

  public Communication makeVideoCall(Terminal to) throws UnsuportedAtOrigin{
    //idk if this error or the one from accept call should go first
    throw new UnsuportedAtOrigin(to.getId());
  }

  protected void acceptVideoCall(Terminal to, VIDEO vid) throws UnsuportedAtDestination{
    throw new UnsuportedAtDestination(to.getId());
  }
}
