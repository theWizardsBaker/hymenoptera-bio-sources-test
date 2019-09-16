package org.intermine.model.bio;

public interface MRNA extends org.intermine.model.InterMineObject
{
    public java.util.Set<org.intermine.model.bio.MiRNATarget> getMiRNAinteractions();
    public void setMiRNAinteractions(final java.util.Set<org.intermine.model.bio.MiRNATarget> miRNAinteractions);
    public void addMiRNAinteractions(final org.intermine.model.bio.MiRNATarget arg);

}
