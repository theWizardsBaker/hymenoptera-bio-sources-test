package org.intermine.model.bio;

public interface MicroarrayOligo extends org.intermine.model.InterMineObject
{
    public java.lang.Float getTm();
    public void setTm(final java.lang.Float tm);

    public org.intermine.model.bio.Transcript getTranscript();
    public void setTranscript(final org.intermine.model.bio.Transcript transcript);
    public void proxyTranscript(final org.intermine.objectstore.proxy.ProxyReference transcript);
    public org.intermine.model.InterMineObject proxGetTranscript();

}
