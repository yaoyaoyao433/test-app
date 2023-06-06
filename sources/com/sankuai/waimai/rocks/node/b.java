package com.sankuai.waimai.rocks.node;

import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public String a;
    public List<a> b;
    public String c;

    public b(RocksServerModel rocksServerModel) {
        super(rocksServerModel);
        this.a = rocksServerModel.layoutType;
        this.c = rocksServerModel.layoutSlot;
        this.b = new ArrayList();
    }
}
