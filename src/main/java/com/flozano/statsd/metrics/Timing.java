package com.flozano.statsd.metrics;

public class Timing extends Metric {

	public Timing(String name, long value, Double sample) {
		super(name, value, sample);
	}

	@Override
	public String getSuffix() {
		return "ms";
	}

}