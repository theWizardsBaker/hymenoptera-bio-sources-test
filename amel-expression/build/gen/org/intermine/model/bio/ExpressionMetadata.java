package org.intermine.model.bio;

public interface ExpressionMetadata extends org.intermine.model.InterMineObject
{
    public java.util.Set<org.intermine.model.bio.Expression> getIsoforms();
    public void setIsoforms(final java.util.Set<org.intermine.model.bio.Expression> isoforms);
    public void addIsoforms(final org.intermine.model.bio.Expression arg);

}
