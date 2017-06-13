/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class TAnd extends Token
{
    public TAnd()
    {
        super.setText("and");
    }

    public TAnd(int line, int pos)
    {
        super.setText("and");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAnd(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAnd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAnd text.");
    }
}