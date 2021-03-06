/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AVarAssignDecVar extends PDecVar
{
    private PType _type_;
    private PVarAssign _varAssign_;

    public AVarAssignDecVar()
    {
        // Constructor
    }

    public AVarAssignDecVar(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") PVarAssign _varAssign_)
    {
        // Constructor
        setType(_type_);

        setVarAssign(_varAssign_);

    }

    @Override
    public Object clone()
    {
        return new AVarAssignDecVar(
            cloneNode(this._type_),
            cloneNode(this._varAssign_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarAssignDecVar(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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
            + toString(this._type_)
            + toString(this._varAssign_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
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
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
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
