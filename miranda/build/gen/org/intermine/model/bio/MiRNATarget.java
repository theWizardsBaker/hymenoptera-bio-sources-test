package org.intermine.model.bio;

public interface MiRNATarget extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.Float getPvalue();
    public void setPvalue(final java.lang.Float pvalue);

    public org.intermine.model.bio.Gene getMirnagene();
    public void setMirnagene(final org.intermine.model.bio.Gene mirnagene);
    public void proxyMirnagene(final org.intermine.objectstore.proxy.ProxyReference mirnagene);
    public org.intermine.model.InterMineObject proxGetMirnagene();

    public org.intermine.model.bio.MRNA getTarget();
    public void setTarget(final org.intermine.model.bio.MRNA target);
    public void proxyTarget(final org.intermine.objectstore.proxy.ProxyReference target);
    public org.intermine.model.InterMineObject proxGetTarget();

}
