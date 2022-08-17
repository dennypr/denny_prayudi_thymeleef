package net.dennyprayudi.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_new")
public class Employee {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;

	@Column(name = "nomer_rekening")
	private String nomerRekening;

	@Column(name = "tanggal")
	private String tanggal;

	@Column(name = "nama")
	private String nama;

	@Column(name = "kelamin")
	private String kelamin;

	@Column(name = "saldo")
	private String saldo;

	@Column(name = "create_date")
	private String createDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomerRekening() {
		return nomerRekening;
	}

	public void setNomerRekening(String nomerRekening) {
		this.nomerRekening = nomerRekening;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKelamin() {
		return kelamin;
	}

	public void setKelamin(String kelamin) {
		this.kelamin = kelamin;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
