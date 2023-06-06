package com.meituan.android.recce.props;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.gens.PropVisitor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface d {
    <T> T accept(BinReader binReader, PropVisitor<T> propVisitor);
}
