/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AAssignVarAssign extends PVarAssign
{
    private PInitialize _initialize_;
    private PVarAssign _varAssign_;

    public AAssignVarAssign()
    {
        // Constructor
    }

    public AAssignVarAssign(
        @SuppressWarnings("hiding") PInitialize _initialize_,
        @SuppressWarnings("hiding") PVarAssign _varAssign_)
    {
        // Constructor
        setInitialize(_initialize_);

        setVarAssign(_varAssign_);

    }

    @Override
    public Object clone()
    {
        return new AAssignVarAssign(
            cloneNode(this._initialize_),
            cloneNode(this._varAssign_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignVarAssign(this);
    }

    public PInitialize getInitialize()
    {
        return this._initialize_;
    }

    public void setInitialize(PInitialize node)
    {
        if(this._initialize_ != null)
        {
            this._initialize_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initialize_ = node;
    }

    public PVarAssign getVarAssign()
    {
        return this._varAssign_;
    }

    public void setVarAssign(PVarAssign node)
    {
        if(this._varAssign_ != null)
        {
            this._varAssign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varAssign_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._initialize_)
            + toString(this._varAssign_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._initialize_ == child)
        {
            this._initialize_ = null;
            return;
        }

        if(this._varAssign_ == child)
        {
            this._varAssign_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._initialize_ == oldChild)
        {
            setInitialize((PInitialize) newChild);
            return;
        }

        if(this._varAssign_ == oldChild)
        {
            setVarAssign((PVarAssign) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
