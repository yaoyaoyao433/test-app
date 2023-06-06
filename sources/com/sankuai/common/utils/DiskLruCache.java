package com.sankuai.common.utils;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    private static final int IO_BUFFER_SIZE = 8192;
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TMP = "journal.tmp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final String VERSION_1 = "1";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int appVersion;
    private final Callable<Void> cleanupCallable;
    private final File directory;
    private final ExecutorService executorService;
    private final File journalFile;
    private final File journalFileTmp;
    private Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private final long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    private static <T> T[] copyOfRange(T[] tArr, int i, int i2) {
        Object[] objArr = {tArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d10293960b885c6b0e3e22a88df3f45", RobustBitConfig.DEFAULT_VALUE)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d10293960b885c6b0e3e22a88df3f45"));
        }
        int length = tArr.length;
        if (i <= i2) {
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3));
            System.arraycopy(tArr, i, tArr2, 0, min);
            return tArr2;
        }
        throw new IllegalArgumentException();
    }

    public static String readFully(Reader reader) throws IOException {
        Object[] objArr = {reader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f561182d8516eb353db97f2f50fad07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f561182d8516eb353db97f2f50fad07");
        }
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }

    public static String readAsciiLine(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b75e02611742a711b60db924fd50c6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b75e02611742a711b60db924fd50c6f");
        }
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16429f8613e70527cf54112a54708e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16429f8613e70527cf54112a54708e06");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void deleteContents(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f0e7b175f8eaf3f6a8b6ebef44ad5b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f0e7b175f8eaf3f6a8b6ebef44ad5b9");
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IllegalArgumentException("not a directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                deleteContents(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    public DiskLruCache(File file, int i, int i2, long j) {
        Object[] objArr = {file, Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7de6f19874c29666f79aa8f94253cc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7de6f19874c29666f79aa8f94253cc4");
            return;
        }
        this.size = 0L;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.nextSequenceNumber = 0L;
        this.executorService = c.a("DiskLruCache", 0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.cleanupCallable = new Callable<Void>() { // from class: com.sankuai.common.utils.DiskLruCache.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2878502d4ed4fd002ccda7a0b4aec419", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2878502d4ed4fd002ccda7a0b4aec419");
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.journalWriter == null) {
                        return null;
                    }
                    DiskLruCache.this.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    return null;
                }
            }
        };
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TMP);
        this.valueCount = i2;
        this.maxSize = j;
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
        Object[] objArr = {file, Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01091bc35c1313a58ed974b1df8ec59b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DiskLruCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01091bc35c1313a58ed974b1df8ec59b");
        }
        if (j > 0) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("valueCount <= 0");
            }
            DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
            if (diskLruCache.journalFile.exists()) {
                try {
                    diskLruCache.readJournal();
                    diskLruCache.processJournal();
                    diskLruCache.journalWriter = new BufferedWriter(new FileWriter(diskLruCache.journalFile, true), 8192);
                    return diskLruCache;
                } catch (IOException unused) {
                    diskLruCache.delete();
                }
            }
            file.mkdirs();
            DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
            diskLruCache2.rebuildJournal();
            return diskLruCache2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void readJournal() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76a501c83db52a14697a3d698d50c55f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76a501c83db52a14697a3d698d50c55f");
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.journalFile), 8192);
        try {
            String readAsciiLine = readAsciiLine(bufferedInputStream);
            String readAsciiLine2 = readAsciiLine(bufferedInputStream);
            String readAsciiLine3 = readAsciiLine(bufferedInputStream);
            String readAsciiLine4 = readAsciiLine(bufferedInputStream);
            String readAsciiLine5 = readAsciiLine(bufferedInputStream);
            if (!MAGIC.equals(readAsciiLine) || !"1".equals(readAsciiLine2) || !Integer.toString(this.appVersion).equals(readAsciiLine3) || !Integer.toString(this.valueCount).equals(readAsciiLine4) || !"".equals(readAsciiLine5)) {
                throw new IOException("unexpected journal header: [" + readAsciiLine + ", " + readAsciiLine2 + ", " + readAsciiLine4 + ", " + readAsciiLine5 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
            while (true) {
                try {
                    readJournalLine(readAsciiLine(bufferedInputStream));
                } catch (EOFException unused) {
                    return;
                }
            }
        } finally {
            closeQuietly(bufferedInputStream);
        }
    }

    private void readJournalLine(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8226713b8db38e53f6637048fa010f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8226713b8db38e53f6637048fa010f9");
            return;
        }
        String[] split = str.split(StringUtil.SPACE);
        if (split.length < 2) {
            throw new IOException("unexpected journal line: " + str);
        }
        String str2 = split[1];
        if (split[0].equals(REMOVE) && split.length == 2) {
            this.lruEntries.remove(str2);
            return;
        }
        Entry entry = this.lruEntries.get(str2);
        if (entry == null) {
            entry = new Entry(str2);
            this.lruEntries.put(str2, entry);
        }
        if (!split[0].equals(CLEAN) || split.length != this.valueCount + 2) {
            if (!split[0].equals(DIRTY) || split.length != 2) {
                if (split[0].equals(READ) && split.length == 2) {
                    return;
                }
                throw new IOException("unexpected journal line: " + str);
            }
            entry.currentEditor = new Editor(entry);
            return;
        }
        entry.readable = true;
        entry.currentEditor = null;
        entry.setLengths((String[]) copyOfRange(split, 2, split.length));
    }

    private void processJournal() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf9702646bf3e7ac449530a3ea49773f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf9702646bf3e7ac449530a3ea49773f");
            return;
        }
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            if (next.currentEditor == null) {
                for (int i = 0; i < this.valueCount; i++) {
                    this.size += next.lengths[i];
                }
            } else {
                next.currentEditor = null;
                for (int i2 = 0; i2 < this.valueCount; i2++) {
                    deleteIfExists(next.getCleanFile(i2));
                    deleteIfExists(next.getDirtyFile(i2));
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void rebuildJournal() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff3b1a12e07bce80b8120a65656a4320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff3b1a12e07bce80b8120a65656a4320");
            return;
        }
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.journalFileTmp), 8192);
        bufferedWriter.write(MAGIC);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.appVersion));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.valueCount));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (Entry entry : this.lruEntries.values()) {
            if (entry.currentEditor != null) {
                bufferedWriter.write("DIRTY " + entry.key + '\n');
            } else {
                bufferedWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
            }
        }
        bufferedWriter.close();
        this.journalFileTmp.renameTo(this.journalFile);
        this.journalWriter = new BufferedWriter(new FileWriter(this.journalFile, true), 8192);
    }

    private static void deleteIfExists(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4363a39f94f9cf67b00c02b8d7999885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4363a39f94f9cf67b00c02b8d7999885");
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized Snapshot get(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2af5acfdf83072cb250073487a9adc99", RobustBitConfig.DEFAULT_VALUE)) {
            return (Snapshot) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2af5acfdf83072cb250073487a9adc99");
        }
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        if (entry.readable) {
            InputStream[] inputStreamArr = new InputStream[this.valueCount];
            for (int i = 0; i < this.valueCount; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(entry.getCleanFile(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("READ " + str + '\n'));
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return new Snapshot(str, entry.sequenceNumber, inputStreamArr);
        }
        return null;
    }

    public final Editor edit(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcb6510527544a5651bb0de68966b07f", RobustBitConfig.DEFAULT_VALUE) ? (Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcb6510527544a5651bb0de68966b07f") : edit(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Editor edit(String str, long j) throws IOException {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e099b411e473e88dc3b7ca3f8e6c561", RobustBitConfig.DEFAULT_VALUE)) {
            return (Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e099b411e473e88dc3b7ca3f8e6c561");
        }
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j == -1 || (entry != null && entry.sequenceNumber == j)) {
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            } else if (entry.currentEditor != null) {
                return null;
            }
            Editor editor = new Editor(entry);
            entry.currentEditor = editor;
            Writer writer = this.journalWriter;
            writer.write("DIRTY " + str + '\n');
            this.journalWriter.flush();
            return editor;
        }
        return null;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final long maxSize() {
        return this.maxSize;
    }

    public final synchronized long size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void completeEdit(Editor editor, boolean z) throws IOException {
        Object[] objArr = {editor, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cbf164c6418bfd27f895a47d80f02e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cbf164c6418bfd27f895a47d80f02e3");
            return;
        }
        Entry entry = editor.entry;
        if (entry.currentEditor != editor) {
            throw new IllegalStateException();
        }
        if (z && !entry.readable) {
            for (int i = 0; i < this.valueCount; i++) {
                if (!entry.getDirtyFile(i).exists()) {
                    editor.abort();
                    throw new IllegalStateException("edit didn't create file " + i);
                }
            }
        }
        for (int i2 = 0; i2 < this.valueCount; i2++) {
            File dirtyFile = entry.getDirtyFile(i2);
            if (z) {
                if (dirtyFile.exists()) {
                    File cleanFile = entry.getCleanFile(i2);
                    dirtyFile.renameTo(cleanFile);
                    long j = entry.lengths[i2];
                    long length = cleanFile.length();
                    entry.lengths[i2] = length;
                    this.size = (this.size - j) + length;
                }
            } else {
                deleteIfExists(dirtyFile);
            }
        }
        this.redundantOpCount++;
        entry.currentEditor = null;
        if ((entry.readable ? 1 : 0) | (z ? 1 : 0)) {
            entry.readable = true;
            this.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
            if (z) {
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.sequenceNumber = j2;
            }
        } else {
            this.lruEntries.remove(entry.key);
            this.journalWriter.write("REMOVE " + entry.key + '\n');
        }
        if (this.size > this.maxSize || journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eba78aac0e33893d2814235bac7395a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eba78aac0e33893d2814235bac7395a5")).booleanValue() : this.redundantOpCount >= 2000 && this.redundantOpCount >= this.lruEntries.size();
    }

    public final synchronized boolean remove(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ff09fff951026efec47b372dc7d6652", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ff09fff951026efec47b372dc7d6652")).booleanValue();
        }
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry != null && entry.currentEditor == null) {
            for (int i = 0; i < this.valueCount; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (!cleanFile.delete()) {
                    throw new IOException("failed to delete " + cleanFile);
                }
                this.size -= entry.lengths[i];
                entry.lengths[i] = 0;
            }
            this.redundantOpCount++;
            this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
            this.lruEntries.remove(str);
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return true;
        }
        return false;
    }

    public final boolean isClosed() {
        return this.journalWriter == null;
    }

    private void checkNotClosed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c96b5842abaac062cf7b96d78e1c240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c96b5842abaac062cf7b96d78e1c240");
        } else if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void flush() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21b9741b250018724c6e81e1bf655725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21b9741b250018724c6e81e1bf655725");
            return;
        }
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a02b21e87c08691014cfb3e9b2f0c070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a02b21e87c08691014cfb3e9b2f0c070");
        } else if (this.journalWriter == null) {
        } else {
            Iterator it = new ArrayList(this.lruEntries.values()).iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (entry.currentEditor != null) {
                    entry.currentEditor.abort();
                }
            }
            trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b48033ae1d5f5582543cf1253aae8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b48033ae1d5f5582543cf1253aae8a");
            return;
        }
        while (this.size > this.maxSize) {
            remove(this.lruEntries.entrySet().iterator().next().getKey());
        }
    }

    public final void delete() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f995985916484540153ef93843dacead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f995985916484540153ef93843dacead");
            return;
        }
        close();
        deleteContents(this.directory);
    }

    private void validateKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb0047b6e9d2779105938c2bd732b30e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb0047b6e9d2779105938c2bd732b30e");
        } else if (str.contains(StringUtil.SPACE) || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + CommonConstant.Symbol.DOUBLE_QUOTES);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inputStreamToString(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5a4fea3f0d130be827177157cd86a55", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5a4fea3f0d130be827177157cd86a55") : readFully(new InputStreamReader(inputStream, UTF_8));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class Snapshot implements Closeable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final InputStream[] ins;
        private final String key;
        private final long sequenceNumber;

        public Snapshot(String str, long j, InputStream[] inputStreamArr) {
            Object[] objArr = {DiskLruCache.this, str, new Long(j), inputStreamArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36abcfb45701348f4fc0fe8dca541bd2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36abcfb45701348f4fc0fe8dca541bd2");
                return;
            }
            this.key = str;
            this.sequenceNumber = j;
            this.ins = inputStreamArr;
        }

        public final Editor edit() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d659858a2178535937a9b85b8c59ca1", RobustBitConfig.DEFAULT_VALUE) ? (Editor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d659858a2178535937a9b85b8c59ca1") : DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final InputStream getInputStream(int i) {
            return this.ins[i];
        }

        public final String getString(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffd1731d61ef4bf085d5439a259b81f8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffd1731d61ef4bf085d5439a259b81f8") : DiskLruCache.inputStreamToString(getInputStream(i));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33da20e7299b1a78c11cf46880bb0d2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33da20e7299b1a78c11cf46880bb0d2a");
                return;
            }
            for (InputStream inputStream : this.ins) {
                DiskLruCache.closeQuietly(inputStream);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class Editor {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Entry entry;
        private boolean hasErrors;

        public Editor(Entry entry) {
            Object[] objArr = {DiskLruCache.this, entry};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f08a53e25f74e078e03aeab1cedf5998", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f08a53e25f74e078e03aeab1cedf5998");
            } else {
                this.entry = entry;
            }
        }

        public final InputStream newInputStream(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "622a830d756a984750ae82086f16e121", RobustBitConfig.DEFAULT_VALUE)) {
                return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "622a830d756a984750ae82086f16e121");
            }
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                if (this.entry.readable) {
                    return new FileInputStream(this.entry.getCleanFile(i));
                }
                return null;
            }
        }

        public final String getString(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84aa5b4bb1375041c15f799a3ef08efc", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84aa5b4bb1375041c15f799a3ef08efc");
            }
            InputStream newInputStream = newInputStream(i);
            if (newInputStream != null) {
                return DiskLruCache.inputStreamToString(newInputStream);
            }
            return null;
        }

        public final OutputStream newOutputStream(int i) throws IOException {
            FaultHidingOutputStream faultHidingOutputStream;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97467b3489c1a68922acd670adc39b6e", RobustBitConfig.DEFAULT_VALUE)) {
                return (OutputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97467b3489c1a68922acd670adc39b6e");
            }
            synchronized (DiskLruCache.this) {
                if (this.entry.currentEditor != this) {
                    throw new IllegalStateException();
                }
                faultHidingOutputStream = new FaultHidingOutputStream(new FileOutputStream(this.entry.getDirtyFile(i)));
            }
            return faultHidingOutputStream;
        }

        public final void set(int i, String str) throws IOException {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d64e223cd26b7f826af183d3b46280", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d64e223cd26b7f826af183d3b46280");
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), DiskLruCache.UTF_8);
                try {
                    outputStreamWriter2.write(str);
                    DiskLruCache.closeQuietly(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    DiskLruCache.closeQuietly(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void commit() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39db4576675e0afea28290d8dfe80f6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39db4576675e0afea28290d8dfe80f6b");
            } else if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
        }

        public final void abort() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2745e3fedbf75ec08d0ccdd3c8c8323b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2745e3fedbf75ec08d0ccdd3c8c8323b");
            } else {
                DiskLruCache.this.completeEdit(this, false);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public class FaultHidingOutputStream extends FilterOutputStream {
            public static ChangeQuickRedirect changeQuickRedirect;

            public FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
                Object[] objArr = {Editor.this, outputStream};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f394e0cedef54803ce000720b9a4a7c8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f394e0cedef54803ce000720b9a4a7c8");
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34ad2cd9b06c6839e014c2667b8539e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34ad2cd9b06c6839e014c2667b8539e1");
                    return;
                }
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d096204a0bc82495e0ea00c9c08836", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d096204a0bc82495e0ea00c9c08836");
                    return;
                }
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8811b93a0d8c10e71c244dff69ec3985", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8811b93a0d8c10e71c244dff69ec3985");
                    return;
                }
                try {
                    this.out.close();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aff1c5087067415c383acf7aa56b1516", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aff1c5087067415c383acf7aa56b1516");
                    return;
                }
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class Entry {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Editor currentEditor;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;

        public Entry(String str) {
            Object[] objArr = {DiskLruCache.this, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a8083a603b182601a831ef2c3e2df97", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a8083a603b182601a831ef2c3e2df97");
                return;
            }
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }

        public final String getLengths() throws IOException {
            long[] jArr;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd7be6abebdb9d20d5c968339e0f4cd", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd7be6abebdb9d20d5c968339e0f4cd");
            }
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(Constants.SPACE);
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLengths(String[] strArr) throws IOException {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc8c36acbeb88f7c9504cf46f01e0667", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc8c36acbeb88f7c9504cf46f01e0667");
            } else if (strArr.length != DiskLruCache.this.valueCount) {
                throw invalidLengths(strArr);
            } else {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
            }
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad215193086abcb5dfe34f1f8a463e28", RobustBitConfig.DEFAULT_VALUE)) {
                return (IOException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad215193086abcb5dfe34f1f8a463e28");
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File getCleanFile(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ce93e1ba371de5c58d20226759b4e37", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ce93e1ba371de5c58d20226759b4e37");
            }
            File file = DiskLruCache.this.directory;
            return new File(file, this.key + i);
        }

        public final File getDirtyFile(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "994fc559a7ee9f1d958abcecd3969dc0", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "994fc559a7ee9f1d958abcecd3969dc0");
            }
            File file = DiskLruCache.this.directory;
            return new File(file, this.key + i + ".tmp");
        }
    }
}
