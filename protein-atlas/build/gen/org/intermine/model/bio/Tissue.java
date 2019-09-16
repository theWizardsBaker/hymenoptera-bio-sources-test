package org.intermine.model.bio;

public interface Tissue extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public org.intermine.model.bio.TissueGroup getTissueGroup();
    public void setTissueGroup(final org.intermine.model.bio.TissueGroup tissueGroup);
    public void proxyTissueGroup(final org.intermine.objectstore.proxy.ProxyReference tissueGroup);
    public org.intermine.model.InterMineObject proxGetTissueGroup();

    public java.util.Set<org.intermine.model.bio.ProteinAtlasExpression> getProteinAtlasExpression();
    public void setProteinAtlasExpression(final java.util.Set<org.intermine.model.bio.ProteinAtlasExpression> proteinAtlasExpression);
    public void addProteinAtlasExpression(final org.intermine.model.bio.ProteinAtlasExpression arg);

}
