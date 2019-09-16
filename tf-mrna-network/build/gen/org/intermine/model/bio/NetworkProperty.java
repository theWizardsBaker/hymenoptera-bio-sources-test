package org.intermine.model.bio;

public interface NetworkProperty extends org.intermine.model.InterMineObject
{
    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getValue();
    public void setValue(final java.lang.String value);

    public org.intermine.model.bio.BioEntity getNode();
    public void setNode(final org.intermine.model.bio.BioEntity node);
    public void proxyNode(final org.intermine.objectstore.proxy.ProxyReference node);
    public org.intermine.model.InterMineObject proxGetNode();

}
