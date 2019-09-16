package org.intermine.model.bio;

public interface PrimaryTranscript extends org.intermine.model.bio.Transcript
{
    public java.lang.String getBiotype();
    public void setBiotype(final java.lang.String biotype);

    public java.lang.String getMirbaseIdentifier();
    public void setMirbaseIdentifier(final java.lang.String mirbaseIdentifier);

    public java.util.Set<org.intermine.model.bio.MatureTranscript> getMatureTranscripts();
    public void setMatureTranscripts(final java.util.Set<org.intermine.model.bio.MatureTranscript> matureTranscripts);
    public void addMatureTranscripts(final org.intermine.model.bio.MatureTranscript arg);

}
