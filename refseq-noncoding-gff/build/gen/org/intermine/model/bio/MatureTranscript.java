package org.intermine.model.bio;

public interface MatureTranscript extends org.intermine.model.InterMineObject
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getMirbaseIdentifier();
    public void setMirbaseIdentifier(final java.lang.String mirbaseIdentifier);

    public java.lang.String getChromosome();
    public void setChromosome(final java.lang.String chromosome);

    public java.lang.Integer getStart();
    public void setStart(final java.lang.Integer start);

    public java.lang.Integer getStrand();
    public void setStrand(final java.lang.Integer strand);

    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public java.lang.String getTranscriptIdentifier();
    public void setTranscriptIdentifier(final java.lang.String transcriptIdentifier);

}
