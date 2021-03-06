/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AArrayExtArray extends PArray
{
    private PArrayExt _arrayExt_;

    public AArrayExtArray()
    {
        // Constructor
    }

    public AArrayExtArray(
        @SuppressWarnings("hiding") PArrayExt _arrayExt_)
    {
        // Constructor
        setArrayExt(_arrayExt_);

    }

    @Override
    public Object clone()
    {
        return new AArrayExtArray(
            cloneNode(this._arrayExt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayExtArray(this);
    }

    public PArrayExt getArrayExt()
    {
        return this._arrayExt_;
    }

    public void setArrayExt(PArrayExt node)
    {
        if(this._arrayExt_ != null)
        {
            this._arrayExt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayExt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrayExt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrayExt_ == child)
        {
            this._arrayExt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrayExt_ == oldChild)
        {
            setArrayExt((PArrayExt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
