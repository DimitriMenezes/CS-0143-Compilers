/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import java.util.*;
import x_language.analysis.*;

@SuppressWarnings("nls")
public final class ADecFunction extends PDecFunction
{
    private TId _id_;
    private PParameters _parameters_;
    private final LinkedList<PExp> _exp_ = new LinkedList<PExp>();

    public ADecFunction()
    {
        // Constructor
    }

    public ADecFunction(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PParameters _parameters_,
        @SuppressWarnings("hiding") List<?> _exp_)
    {
        // Constructor
        setId(_id_);

        setParameters(_parameters_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ADecFunction(
            cloneNode(this._id_),
            cloneNode(this._parameters_),
            cloneList(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFunction(this);
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

    public LinkedList<PExp> getExp()
    {
        return this._exp_;
    }

    public void setExp(List<?> list)
    {
        for(PExp e : this._exp_)
        {
            e.parent(null);
        }
        this._exp_.clear();

        for(Object obj_e : list)
        {
            PExp e = (PExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._parameters_)
            + toString(this._exp_);
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

        if(this._parameters_ == child)
        {
            this._parameters_ = null;
            return;
        }

        if(this._exp_.remove(child))
        {
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

        if(this._parameters_ == oldChild)
        {
            setParameters((PParameters) newChild);
            return;
        }

        for(ListIterator<PExp> i = this._exp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
