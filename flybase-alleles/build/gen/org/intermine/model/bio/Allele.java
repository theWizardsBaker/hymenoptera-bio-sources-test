package org.intermine.model.bio;

public interface Allele extends org.intermine.model.InterMineObject
{
    public java.util.Set<org.intermine.model.bio.DOAnnotation> getDoAnnotation();
    public void setDoAnnotation(final java.util.Set<org.intermine.model.bio.DOAnnotation> doAnnotation);
    public void addDoAnnotation(final org.intermine.model.bio.DOAnnotation arg);

}
