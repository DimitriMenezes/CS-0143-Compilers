/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class AParameterListParameters extends PParameters
{
    private PType _type_;
    private TId _id_;
    private PParameters _parameters_;

    public AParameterListParameters()
    {
        // Constructor
    }

    public AParameterListParameters(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PParameters _parameters_)
    {
        // Constructor
        setType(_type_);

        setId(_id_);

        setParameters(_parameters_);

    }

    @Override
    public Object clone()
    {
        return new AParameterListParameters(
            cloneNode(this._type_),
            cloneNode(this._id_),
            cloneNode(this._parameters_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParameterListParameters(this);
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

    public PParameters getParameters()
    {
        return this._parameters_;
    }

    public void setParameters(PParameters node)
    {
        if(this._parameters_ != null)
        {
            this._parameters_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameters_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._id_)
            + toString(this._parameters_);
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

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parameters_ == child)
        {
            this._parameters_ = null;
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

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._parameters_ == oldChild)
        {
            setParameters((PParameters) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
