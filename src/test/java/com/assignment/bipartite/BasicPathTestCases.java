package com.assignment.bipartite;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasicPathTestCases {

SolutionOne solution;
	
	@BeforeEach
	public void init() {
		solution = new SolutionOne();
	}
	
	@DisplayName("Test case 17: path 1: 1 -> 2 -> 3 -> 5 -> 6 -> 8 -> 9 -> 11 -> 12 -> 8 -> 9 -> 10 -> 12 -> 2 -> 3 -> 4 -> end")
	@Test
	public void testBipartiteGraph_Path1_TC18() {
		// 
		
		int[][] bipartiteGraph = { 
				{1, 3}, 
				{0, 2}, 
				{1, 3}, 
				{0, 2} 
			};
		
		assertTrue(solution.isBipartite(bipartiteGraph));
	}
	
	@DisplayName("Test case 18: path 2: 1 -> 2 -> 3 -> 5 -> 6 -> 8 -> 9 -> 11 -> 12 -> 8 -> 9 -> 10 -> 12 -> 13 -> 6 -> 7 -> end1 -> 2 -> 3 -> 5 -> 6 -> 8 -> 9 -> 10 -> 11 -> 13 -> 7")
	@Test
	public void testBipartiteGraph_Path2_TC18() {
		
		
		int[][] bipartiteGraph = { 
				{1,2}, 
				{0,2}, 
				{0,1,3}, 
				{2,4},
				{3}
			};
		
		assertFalse(solution.isBipartite(bipartiteGraph));
	}
	
	@DisplayName("Test Case 19: path 3: 1 -> 2 -> 3 -> 5 -> 6 -> 8 -> 11 - > 2 -> end")
	@Test
    public void testBipartiteGraph_Path3_TC19() {
		
		
        int[][] bipartiteGraph = new int[1][0];
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName("Test Case 20: path 4: 1 -> 2 -> end")
	@Test
    public void testBipartiteGraph_Path4_TC20() {
		
		
        int[][] bipartiteGraph = new int[0][0];
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName("Test Case 21 path 5: 1 -> end")
	@Test
    public void testBipartiteGraph_Path5_TC21() {
		// 
        int[][] nonBipartiteGraph = {
        		null
        };
        assertThrows(NullPointerException.class,()->{
        	solution.isBipartite(nonBipartiteGraph);
        });
    }

}
