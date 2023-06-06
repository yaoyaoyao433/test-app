package com.sankuai.waimai.platform.widget.filterbar.domain.model;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class h {
    public ArrayList<a> a;
    public ArrayList<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public long a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public int g;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.a h;
        public long i;
        public boolean j;
        public String k;
        public String l;

        public a() {
            this.j = false;
        }

        public a(a aVar) {
            this.j = false;
            if (aVar != null) {
                this.a = aVar.a;
                this.b = aVar.b;
                this.c = aVar.c;
                this.d = aVar.d;
                this.e = aVar.e;
                this.f = aVar.f;
                this.g = aVar.g;
                this.i = aVar.i;
                this.j = aVar.j;
                this.k = aVar.k;
                this.l = aVar.l;
                if (aVar.h == null) {
                    this.h = null;
                } else {
                    this.h = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(aVar.h);
                }
            }
        }
    }
}
