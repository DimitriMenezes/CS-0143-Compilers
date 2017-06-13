/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AAssignArrayExtCommand extends PCommand
{
    private TId _id_;
    private PArrayExt _arrayExt_;

    public AAssignArrayExtCommand()
    {
        // Constructor
    }

    public AAssignArrayExtCommand(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PArrayExt _arrayExt_)
    {
        // Constructor
        setId(_id_);

        setArrayExt(_arrayExt_);

    }

    @Override
    public Object clone()
    {
        return new AAssignArrayExtCommand(
            cloneNode(this._id_),
            cloneNode(this._arrayExt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignArrayExtCommand(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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
            + toString(this._id_)
            + toString(this._arrayExt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

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
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._arrayExt_ == oldChild)
        {
            setArrayExt((PArrayExt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
