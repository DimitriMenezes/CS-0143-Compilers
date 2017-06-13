/* This file was generated by SableCC (http://www.sablecc.org/). */

package x_language.node;

import x_language.analysis.*;

@SuppressWarnings("nls")
public final class TSize extends Token
{
    public TSize()
    {
        super.setText("size");
    }

    public TSize(int line, int pos)
    {
        super.setText("size");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSize(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSize(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSize text.");
    }
}
