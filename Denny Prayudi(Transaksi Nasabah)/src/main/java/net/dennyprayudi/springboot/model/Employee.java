package net.dennyprayudi.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_transaksi")
public class Employee {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;

	@Column(name = "nomer_rekening")
	private String nomerRekening;

	@Column(name = "tanggal")
	private String tanggal;

	@Column(name = "jenis_transaksi")
	private String jenisTransaksi;

	@Column(name = "nominal_transaksi")
	private String nominalTransaksi;

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

	public String getJenisTransaksi() {
		return jenisTransaksi;
	}

	public void setJenisTransaksi(String jenisTransaksi) {
		this.jenisTransaksi = jenisTransaksi;
	}

	public String getNominalTransaksi() {
		return nominalTransaksi;
	}

	public void setNominalTransaksi(String nominalTransaksi) {
		this.nominalTransaksi = nominalTransaksi;
	}
}
