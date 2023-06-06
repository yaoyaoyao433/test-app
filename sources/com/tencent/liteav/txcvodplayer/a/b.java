package com.tencent.liteav.txcvodplayer.a;

import android.net.Uri;
import com.meituan.robust.common.CommonConstant;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static final String a = "b";
    private static b b = new b();
    private ArrayList<a> c;
    private HashSet<a> d;
    private String e;
    private int f;
    private String g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements Serializable {
        String fileType;
        String path;
        Long time;
        String url;

        a() {
        }

        public String a() {
            return this.url;
        }

        public void a(String str) {
            this.url = str;
        }

        public String b() {
            return this.path;
        }

        public void b(String str) {
            this.path = str;
        }

        public Long c() {
            return this.time;
        }

        public void a(Long l) {
            this.time = l;
        }

        public void c(String str) {
            this.fileType = str;
        }

        public String d() {
            if (this.fileType == null && this.path != null) {
                if (this.path.endsWith("mp4")) {
                    return "mp4";
                }
                if (this.path.endsWith("m3u8.sqlite")) {
                    return IjkMediaMeta.IJKM_KEY_M3U8;
                }
            }
            return this.fileType;
        }
    }

    public static b a() {
        return b;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        this.g = str;
    }

    public void b(String str) {
        String concat;
        if (str.endsWith("/")) {
            concat = str.concat("txvodcache");
        } else {
            concat = str.concat("/txvodcache");
        }
        if (this.e == null || !this.e.equals(concat)) {
            this.e = concat;
            if (this.e == null) {
                return;
            }
            new File(this.e).mkdirs();
            if (b()) {
                return;
            }
            e();
        }
    }

    public String c(String str) {
        int indexOf;
        int indexOf2 = str.indexOf("voddrm.token.");
        if (indexOf2 >= 0 && (indexOf = str.indexOf(CommonConstant.Symbol.DOT, "voddrm.token.".length() + indexOf2)) >= 0 && indexOf < str.length() - 1) {
            str = str.substring(0, indexOf2) + str.substring(indexOf + 1);
        }
        int indexOf3 = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        return indexOf3 >= 0 ? str.substring(0, indexOf3) : str;
    }

    public com.tencent.liteav.txcvodplayer.a.a d(String str) {
        if (this.e == null || str == null) {
            return null;
        }
        String c = c(str);
        File file = new File(this.e);
        if (file.mkdirs() || file.isDirectory()) {
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.url.equals(c)) {
                    a(next);
                    this.d.add(next);
                    return new com.tencent.liteav.txcvodplayer.a.a(next.path, this.e, next.fileType);
                }
            }
            Iterator<a> it2 = this.c.iterator();
            while (it2.hasNext() && this.c.size() > this.f) {
                a next2 = it2.next();
                if (!this.d.contains(next2)) {
                    b(next2);
                    it2.remove();
                }
            }
            a f = f(c);
            if (f != null) {
                this.d.add(f);
                return new com.tencent.liteav.txcvodplayer.a.a(f.path, this.e, f.fileType);
            }
            return null;
        }
        return null;
    }

    public boolean e(String str) {
        Uri parse = Uri.parse(str);
        if (parse == null || parse.getPath() == null || parse.getScheme() == null || !parse.getScheme().startsWith("http")) {
            return false;
        }
        return parse.getPath().endsWith(".mp4") || parse.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8) || parse.getPath().endsWith(".MP4") || parse.getPath().endsWith("M3U8");
    }

    boolean b() {
        this.c = new ArrayList<>();
        this.d = new HashSet<>();
        try {
            for (Node firstChild = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(this.e + "/tx_cache.xml")).getElementsByTagName("caches").item(0).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                a aVar = new a();
                for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNextSibling()) {
                    if (firstChild2.getNodeName().equals("path")) {
                        aVar.b(firstChild2.getFirstChild().getNodeValue());
                    } else if (firstChild2.getNodeName().equals("time")) {
                        aVar.a(Long.valueOf(Long.parseLong(firstChild2.getFirstChild().getNodeValue())));
                    } else if (firstChild2.getNodeName().equals("url")) {
                        aVar.a(firstChild2.getFirstChild().getNodeValue());
                    } else if (firstChild2.getNodeName().equals("fileType")) {
                        aVar.c(firstChild2.getFirstChild().getNodeValue());
                    }
                }
                this.c.add(aVar);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    void c() {
        try {
            Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element createElement = newDocument.createElement("caches");
            newDocument.appendChild(createElement);
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                Element createElement2 = newDocument.createElement("cache");
                createElement.appendChild(createElement2);
                Element createElement3 = newDocument.createElement("path");
                createElement3.appendChild(newDocument.createTextNode(next.b()));
                createElement2.appendChild(createElement3);
                Element createElement4 = newDocument.createElement("time");
                createElement4.appendChild(newDocument.createTextNode(next.c().toString()));
                createElement2.appendChild(createElement4);
                Element createElement5 = newDocument.createElement("url");
                createElement5.appendChild(newDocument.createTextNode(next.a()));
                createElement2.appendChild(createElement5);
                Element createElement6 = newDocument.createElement("fileType");
                createElement6.appendChild(newDocument.createTextNode(next.d()));
                createElement2.appendChild(createElement6);
            }
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            DOMSource dOMSource = new DOMSource(newDocument);
            StreamResult streamResult = new StreamResult();
            streamResult.setSystemId(new File(this.e, "tx_cache.xml").getAbsolutePath());
            newTransformer.transform(dOMSource, streamResult);
            System.out.println("File saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void a(a aVar) {
        aVar.time = Long.valueOf(System.currentTimeMillis());
        this.c.remove(aVar);
        this.c.add(aVar);
        c();
    }

    a f(String str) {
        a aVar = new a();
        aVar.url = str;
        aVar.time = Long.valueOf(System.currentTimeMillis());
        String g = g(str);
        Uri parse = Uri.parse(str);
        if (parse.getPath().endsWith(".mp4") || parse.getPath().endsWith(".MP4")) {
            if (this.g != null) {
                aVar.b(g + CommonConstant.Symbol.DOT + this.g);
            } else {
                aVar.b(g + ".mp4");
            }
            aVar.c("mp4");
        } else if (!parse.getPath().endsWith(".m3u8") && !parse.getPath().endsWith(".M3U8")) {
            return null;
        } else {
            aVar.b(g + ".m3u8.sqlite");
            aVar.c(IjkMediaMeta.IJKM_KEY_M3U8);
        }
        this.c.add(aVar);
        c();
        return aVar;
    }

    public static String g(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void e() {
        if (new File(this.e).listFiles().length > 0) {
            StringBuilder sb = new StringBuilder("!!!Warning: TXVodPlayer cache directory is not empty ");
            sb.append(this.e);
            sb.append("!!!");
        }
    }

    private void a(String str, final String str2) {
        final String str3 = this.e + "/" + str;
        new Thread(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                new File(str3).delete();
                if (str2.equals("mp4")) {
                    new File(str3.concat(".info")).delete();
                }
                String unused = b.a;
                new StringBuilder("delete ").append(str3);
            }
        }, "vodCacheMgrDelfile").start();
    }

    private void b(a aVar) {
        a(aVar.b(), aVar.d());
    }

    public void a(String str, boolean z) {
        Iterator<a> it = this.d.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b().equals(str)) {
                it.remove();
                if (z) {
                    b(next);
                    this.c.remove(next);
                    c();
                }
            }
        }
    }
}
