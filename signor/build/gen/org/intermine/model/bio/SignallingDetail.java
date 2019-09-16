package org.intermine.model.bio;

public interface SignallingDetail extends org.intermine.model.InterMineObject
{
    public java.lang.String getEffect();
    public void setEffect(final java.lang.String effect);

    public java.lang.String getMechanismSequences();
    public void setMechanismSequences(final java.lang.String mechanismSequences);

    public java.lang.String getEffectMechanism();
    public void setEffectMechanism(final java.lang.String effectMechanism);

    public java.lang.String getNotes();
    public void setNotes(final java.lang.String notes);

    public java.lang.String getMechanismResidues();
    public void setMechanismResidues(final java.lang.String mechanismResidues);

    public org.intermine.model.bio.Signalling getSignalling();
    public void setSignalling(final org.intermine.model.bio.Signalling signalling);
    public void proxySignalling(final org.intermine.objectstore.proxy.ProxyReference signalling);
    public org.intermine.model.InterMineObject proxGetSignalling();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
