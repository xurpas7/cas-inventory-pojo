package org.rmj.cas.inventory.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Inv_Count_Detail")

/**
 * Inv_Count_Detail table POJO
 * @author Michael Torres Cuison
 * @since 2018.10.03
 */
public class UnitInvCountDetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Id
    @Basic(optional = false)
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
        
    @Column(name = "sLocatnCd")
    private String sLocatnCd;    
    
    @Column(name = "nQtyOnHnd")
    private int nQtyOnHnd;    
    
    @Column(name = "nActCtr01")
    private int nActCtr01;    
    
    @Column(name = "nActCtr02")
    private int nActCtr02;    
    
    @Column(name = "nActCtr03")
    private int nActCtr03;    
    
    @Column(name = "nFinalCtr")
    private int nFinalCtr;    
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitInvCountDetail(){
        this.sTransNox = "";
        this.nEntryNox = -1;
        this.sStockIDx = "";
        this.sLocatnCd = "";
        this.nQtyOnHnd = 0;
        this.nActCtr01 = 0;
        this.nActCtr02 = 0;
        this.nActCtr03 = 0;
        this.nFinalCtr = 0;
        this.sRemarksx = "";
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("sLocatnCd");
        laColumns.add("nQtyOnHnd");
        laColumns.add("nActCtr01");
        laColumns.add("nActCtr02");
        laColumns.add("nActCtr03");
        laColumns.add("nFinalCtr");
        laColumns.add("sRemarksx");
        laColumns.add("dModified");
    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setStockIDx(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockIDx(){
        return sStockIDx;
    }
    
    public void setLocatnCd(String sLocatnCd){
        this.sLocatnCd = sLocatnCd;
    }
    public String getLocatnCd(){
        return sLocatnCd;
    }
    
    public void setQtyOnHnd(int nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    public int getQtyOnHnd(){
        return nQtyOnHnd;
    }
    
    public void setActCtr01(int nActCtr01){
        this.nActCtr01 = nActCtr01;
    }
    public int getActCtr01(){
        return nActCtr01;
    }
    
    public void setActCtr02(int nActCtr02){
        this.nActCtr02 = nActCtr02;
    }
    public int getActCtr02(){
        return nActCtr02;
    }
    
    public void setActCtr03(int nActCtr03){
        this.nActCtr03 = nActCtr03;
    }
    public int getActCtr03(){
        return nActCtr03;
    }
    
    public void setFinalCtr(int nFinalCtr){
        this.nFinalCtr = nFinalCtr;
    }
    public int getFinalCtr(){
        return nFinalCtr;
    }
        
    public void setRemarksx(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarksx(){
        return sRemarksx;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitInvCountDetail)) {
            return false;
        }
        UnitInvCountDetail other = (UnitInvCountDetail) object;
        return !((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox)) ||
                (this.nEntryNox == -1 && other.nEntryNox != -1) || (this.nEntryNox != -1 && this.nEntryNox != other.nEntryNox));
    }
    
    @Override
    public String toString() {
        return "org.rmj.inventory.pojo.UnitInvCountDetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sStockIDx;
            case 4: return sLocatnCd;
            case 5: return nQtyOnHnd;
            case 6: return nActCtr01;
            case 7: return nActCtr02;
            case 8: return nActCtr03;
            case 9: return nFinalCtr;
            case 10: return sRemarksx;
            case 11: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Inv_Count_Detail";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: nEntryNox = (int) foValue; break;
            case 3: sStockIDx = (String) foValue; break;
            case 4: sLocatnCd = (String) foValue; break;
            case 5: nQtyOnHnd = (int) foValue; break;
            case 6: nActCtr01 = (int) foValue; break;
            case 7: nActCtr02 = (int) foValue; break;
            case 8: nActCtr03 = (int) foValue; break;
            case 9: nFinalCtr = (int) foValue; break;
            case 10: sRemarksx = (String) foValue; break;
            case 11: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }
    
    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }
}