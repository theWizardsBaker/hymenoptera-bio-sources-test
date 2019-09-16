package org.intermine.model.bio;

public interface Regulation extends org.intermine.model.InterMineObject
{
    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public org.intermine.model.bio.BioEntity getTarget();
    public void setTarget(final org.intermine.model.bio.BioEntity target);
    public void proxyTarget(final org.intermine.objectstore.proxy.ProxyReference target);
    public org.intermine.model.InterMineObject proxGetTarget();

    public org.intermine.model.bio.BioEntity getSource();
    public void setSource(final org.intermine.model.bio.BioEntity source);
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source);
    public org.intermine.model.InterMineObject proxGetSource();

}
