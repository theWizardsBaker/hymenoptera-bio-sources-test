package org.intermine.model.bio;

public interface TissueGroup extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.util.Set<org.intermine.model.bio.Tissue> getTissues();
    public void setTissues(final java.util.Set<org.intermine.model.bio.Tissue> tissues);
    public void addTissues(final org.intermine.model.bio.Tissue arg);

}
