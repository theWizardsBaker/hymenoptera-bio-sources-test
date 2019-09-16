package org.intermine.model.bio;

public interface BindingSite extends org.intermine.model.InterMineObject
{
    public org.intermine.model.bio.Gene getFactor();
    public void setFactor(final org.intermine.model.bio.Gene factor);
    public void proxyFactor(final org.intermine.objectstore.proxy.ProxyReference factor);
    public org.intermine.model.InterMineObject proxGetFactor();

}
