package com.sankuai.waimai.rocks.page.model;

import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.node.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.rocks.node.a {
    public String t;
    public RocksServerModel u;
    public List<c> v;

    public a(RocksServerModel rocksServerModel) {
        super(rocksServerModel);
        this.t = rocksServerModel.layoutType;
        if (rocksServerModel.module_tab != null) {
            this.u = rocksServerModel.module_tab;
        } else {
            this.u = rocksServerModel.module_tabs;
        }
        this.v = new ArrayList();
    }
}
